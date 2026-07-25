import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class Student {

  students = [
    {
      id: 1,
      name: 'Deepa',
      course: 'Angular'
    },
    {
      id: 2,
      name: 'Rahul',
      course: 'Java'
    },
    {
      id: 3,
      name: 'Priya',
      course: 'Spring Boot'
    }
  ];

  getStudents() {
    return this.students;
  }
}
