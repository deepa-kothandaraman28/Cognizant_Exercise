import { Component } from '@angular/core';
import { NgFor } from '@angular/common';
import { CourseCard } from '../../components/course-card/course-card';

@Component({
  selector: 'app-course-list',
  standalone: true,
  imports: [NgFor, CourseCard],
  templateUrl: './course-list.html',
  styleUrl: './course-list.css'
})
export class CourseList {

  selectedCourse = 0;

  courses = [
    {
      id: 1,
      name: 'Java',
      code: 'CS101',
      credits: 4
    },
    {
      id: 2,
      name: 'Angular',
      code: 'CS201',
      credits: 3
    },
    {
      id: 3,
      name: 'Spring Boot',
      code: 'CS301',
      credits: 4
    }
  ];

  onEnroll(id: number) {
    this.selectedCourse = id;
    console.log('Enrolling in course:', id);
  }

}
