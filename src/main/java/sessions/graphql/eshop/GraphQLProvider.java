package sessions.graphql.eshop;

import com.google.common.base.Charsets;
import com.google.common.io.Resources;
import graphql.GraphQL;
import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import graphql.schema.GraphQLSchema;
import graphql.schema.idl.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sessions.graphql.eshop.dealers.DealerService;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.net.URL;

@Component
public class GraphQLProvider {

    private GraphQL graphQL;

    public GraphQL graphQL(){
        return graphQL;
    }

    @Autowired
    DealerService dealerService;


    @PostConstruct
    public void init() throws IOException {
        URL url = Resources.getResource("schema.graphqls");
        String contents = Resources.toString(url, Charsets.UTF_8);
        GraphQLSchema graphQLSchema = buildSchema(contents);
        this.graphQL = GraphQL.newGraphQL(graphQLSchema).build();
    }

    GraphQLSchema buildSchema(String schemaContents){

        TypeDefinitionRegistry typeDefinitionRegistry = new SchemaParser().parse(schemaContents);
        RuntimeWiring wiring = buildWiring();
        SchemaGenerator schemaGenerator = new SchemaGenerator();
        return schemaGenerator.makeExecutableSchema(typeDefinitionRegistry,wiring);
    }
    RuntimeWiring buildWiring(){

        return RuntimeWiring.newRuntimeWiring()
                .type(TypeRuntimeWiring.newTypeWiring("Query")
                .dataFetcher("dealerById",getDealerById())                )
                .build();

    }
    DataFetcher getDealerById(){

        return new DataFetcher() {
            @Override
            public Object get(DataFetchingEnvironment environment) throws Exception {

                Long id = Long.parseLong(environment.getArgument("id"));

                return dealerService.getDealerById(id);
            }
        };
    }
}
