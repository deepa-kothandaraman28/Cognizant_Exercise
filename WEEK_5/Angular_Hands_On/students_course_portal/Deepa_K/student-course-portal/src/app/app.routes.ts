import { Routes } from '@angular/router';

import { Home } from './pages/home/home';
import { CourseList } from './pages/course-list/course-list';
import { StudentProfile } from './pages/student-profile/student-profile';
import { StudentRegistration } from './pages/student-registration/student-registration';
import { StudentLogin } from './pages/student-login/student-login';
import { StudentList } from './pages/student-list/student-list';
import { Users } from './pages/users/users';

export const routes: Routes = [

  { path:'',component:Home },

  { path:'courses',component:CourseList },

  { path:'profile',component:StudentProfile },

  { path:'register',component:StudentRegistration },

  { path:'login',component:StudentLogin },

  { path:'students',component:StudentList },

  { path:'users',component:Users },

  { path:'**',redirectTo:'' }

];
