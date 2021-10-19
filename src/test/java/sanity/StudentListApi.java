package sanity;

import extensions.Verifications;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workFlows.ApiFlowes;

@Listeners(utilities.Listeners.class)
public class StudentListApi extends CommonOps {

 @Test(description = "Test01 - Get Student lists From Student List")
  @Description("This Test Verify student Property")
  public void test01_verifyStudentProperty() {
  Verifications.verifayText(ApiFlowes.getStudentProperty("[0].firstName"), "Vernon");

  }


    @Test(description = "Test02 - Add Student to Student List And Verify")
    @Description("This Test Add Student to Student List  And Verify It")
    public void test02_addStudentndVerify() {
        ApiFlowes.postStudent("Milach", "Mor", "lilachmor11@gmail.com", "Some Engineering");
        Verifications.verifayText(ApiFlowes.getStudentProperty("[100].firstName"), "Milach");

    }

    @Test(description = "Test03 - Update Student And Verify")
    @Description("This Test Updates a Student in Student list And Verify It")
    public void test03_updateStudentAndVerify() {
  String id = ApiFlowes.getStudentProperty("[100].id");
        ApiFlowes.updateStudent("Milach", "Mor", "lilachmor11@gmail.com", "Computer Science", id);
  Verifications.verifayText(ApiFlowes.getStudentProperty("[100].programme"), "Computer Science");

    }

    @Test(description = "Test04 - Delete Student And Verify")
    @Description("This Test Delete a Student from Studentlist And Verify It")
    public void test04_deleteStudentAndVerify() {
        String id = ApiFlowes.getStudentProperty("[100].id");
        ApiFlowes.deleteStudent(id);
        Verifications.verifayText(ApiFlowes.getStudentProperty("[99].firstName"), "Oscar");

    }
}
