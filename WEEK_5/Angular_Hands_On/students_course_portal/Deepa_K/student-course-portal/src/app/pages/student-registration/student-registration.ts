import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-student-registration',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './student-registration.html',
  styleUrl: './student-registration.css'
})
export class StudentRegistration {

  student = {
    name: '',
    email: '',
    course: '',
    phone: ''
  };

  submit() {
    alert('Registration Successful');
    console.log(this.student);
  }
}
