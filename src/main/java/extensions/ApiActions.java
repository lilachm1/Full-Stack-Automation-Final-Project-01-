package extensions;

import io.qameta.allure.Step;
import io.restassured.response.Response;
import org.json.simple.JSONObject;
import utilities.CommonOps;

public class ApiActions extends CommonOps {



    @Step("Get Data From Server")
    public static Response get(String ParamValues) {
        response = httpRequest.get(ParamValues);
        response.prettyPrint();
        return response;

    }


    @Step("Extract Value From Json Format")
    public static String extractFromJson(Response response, String path) {
        jp = response.jsonPath();
        return jp.get(path).toString();
    }

    @Step("Post Data to Server")
    public static void post(JSONObject Params, String resource) {
        httpRequest.header("Content-Type", "application/json");
        httpRequest.body(Params.toJSONString());
        response = httpRequest.post(resource);
        response.prettyPrint();
    }

    @Step("Update Data to Server")
    public static void put(JSONObject Params, String resource) {
        httpRequest.header("Content-Type", "application/json");
        httpRequest.body(Params.toJSONString());
        response = httpRequest.put(resource);
        response.prettyPrint();

    }

    @Step("Delete Data From Server")
    public static void delete(String id) {
        response = httpRequest.delete("/student/" + id);
        response.prettyPrint();
    }
}

