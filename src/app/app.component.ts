import { Component, OnInit } from '@angular/core';
import { EmployeeService } from './service/employee.service';

const surveyJson = {
  // ...
};

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  employees={
    name:'',
    valuedAtWorks:'',
    feedbacks:'',
    overallSatisfaction:'',
    dayOfWeek:''
  }

  title = 'newTask2';
  employee:any
  constructor(private empService:EmployeeService){

  }
  public ngOnInit(): void {
    this.empService.getAllData().subscribe((data:any)=>{
      this.employee = data;
      console.log(this.employee);
    })
  }

  formSubmit(){
    
    console.log(this.employees)
    this.empService.addData(this.employees).subscribe((data)=>{
      alert("Data is saved")
    },
    (error)=>{
      alert("data is not saved");
    })
  }

}
