package uk.ac.port.SUMS.ProjectIdeas.presentation;
import javax.ejb.*;
import javax.inject.*;
import javax.enterprise.context.*;
import uk.ac.port.SUMS.kernel.infrastructure.*;
import uk.ac.port.SUMS.kernel.presentation.*;
import uk.ac.port.SUMS.kernel.model.*;
import uk.ac.port.SUMS.kernel.persistence.*;

@Named(value="I")
@RequestScoped
public class ProjectIdeaController extends AuthenticatedController{
 private String Title=null;
 private ProjectIdea Model=null;
 @EJB
 private ProjectIdeaDAO DAO;
 private final StringSanitizer StringSanitizerService=new StringSanitizer();
 public ProjectIdeaController(){}
 
 public String getTitle(){
  return Title;
 }
 public void setTitle(String Title){
  this.Title=StringSanitizerService.ProcessLine(Title);
 }
 public boolean getSuccess(){
  return this.Model!=null;
 }
 public ProjectIdea getModel(){
  return this.Model;
 }
 
 public boolean getCanNavigateToAmendIdea(){
  return Model.canEdit(getCurrentUser());
 }
 public boolean getCanNavigateToStatusChanges(){
  return Model.canViewStatusChanges(getCurrentUser());
 }
 
 public void LoadModel(){
  if(this.Title==null||this.Title.isEmpty()){
   //TODO Redirect
  }
  //TODO Not found and any other error handling
  ProjectIdea Model=DAO.Read(this.Title);
  if(!Model.canView(getCurrentUser())){
   //TODO Error handling
  }
  this.Model=Model;
 }
}