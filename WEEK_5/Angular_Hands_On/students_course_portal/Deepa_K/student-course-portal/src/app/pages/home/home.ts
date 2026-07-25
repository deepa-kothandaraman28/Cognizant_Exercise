import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-home',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './home.html',
  styleUrl: './home.css'
})
export class Home {

  studentName = 'Deepa';

  isLoggedIn = true;

  courses = [
    'Java',
    'Angular',
    'Spring Boot',
    'Database'
  ];

  today = new Date();

  fee = 25000;

  attendance = 0.92;

}
