import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  constructor(private http:HttpClient) { }
  
  //getting AllValues from Database
  public getAllData(){
    return this.http.get(`http://localhost:8989/fatch`);
  }

  public addData(empData:any){
    console.log("data in service:"+JSON.stringify(empData));
    return this.http.post(`http://localhost:8989/save`,empData)
  }
}
