import { Component, Input, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-course-card',
  standalone: true,
  imports: [],
  templateUrl: './course-card.html',
  styleUrl: './course-card.css'
})
export class CourseCard {

  @Input() course: any;

  @Output() enroll = new EventEmitter<number>();

  enrollCourse() {
    this.enroll.emit(this.course.id);
  }
}
