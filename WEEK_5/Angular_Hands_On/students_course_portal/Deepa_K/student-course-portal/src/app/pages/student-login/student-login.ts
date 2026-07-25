import { Component } from '@angular/core';
import { ReactiveFormsModule, FormBuilder, Validators } from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-student-login',
  standalone: true,
  imports: [CommonModule, ReactiveFormsModule],
  templateUrl: './student-login.html',
  styleUrl: './student-login.css'
})
export class StudentLogin {

  loginForm;

  constructor(private fb: FormBuilder) {
    this.loginForm = this.fb.group({
      username: ['', Validators.required],
      password: ['', [Validators.required, Validators.minLength(6)]]
    });
  }

  login() {
    if (this.loginForm.valid) {
      alert('Login Successful');
      console.log(this.loginForm.value);
    }
  }
}
