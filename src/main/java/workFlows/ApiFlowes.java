package workFlows;

import extensions.ApiActions;
import io.qameta.allure.Step;
import utilities.CommonOps;

public class ApiFlowes extends CommonOps {

    @Step("Business Flow: Get Student Property")
    public static String getStudentProperty(String jPat) {
        response = ApiActions.get("/student/list");
        return ApiActions.extractFromJson(response, jPat);
    }

    @Step("Business Flow: Creat New Student in server")
    public static void postStudent(String firstName, String lastName, String email, String programme) {

        Params.put("firstName", firstName);
        Params.put("lastName", lastName);
        Params.put("email", email);
        Params.put("programme", programme);


        ApiActions.post(Params, "/student");
    }

    @Step("Business Flow: Update Existing Student in Studentlist")
    public static void updateStudent(String firstName, String lastName, String email, String programme, String id) {
        Params.put("firstName", firstName);
        Params.put("lastName", lastName);
        Params.put("email", email);
        Params.put("programme", programme);
        ApiActions.put(Params, "/student/"+ id);
    }

    @Step("Business Flow: Delet Existing Student  in Studentlist")
    public static void deleteStudent(String id) {
        ApiActions.delete(id);
    }
}




