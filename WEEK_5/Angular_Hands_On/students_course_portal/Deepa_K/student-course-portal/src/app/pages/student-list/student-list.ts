import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Student } from '../../services/student';

@Component({
  selector: 'app-student-list',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './student-list.html',
  styleUrl: './student-list.css'
})
export class StudentList {

  students: any[] = [];

  constructor(private studentService: Student) {
    this.students = this.studentService.getStudents();
  }

}
