import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { Z1CreateFormComponent } from './z1/z1-create-form/z1-create-form.component';
import { A1CreateFormComponent } from './a1/a1-create-form/a1-create-form.component';
import { ViewAllA1RequestsComponent } from 'src/admin/view-all-a1-requests/view-all-a1-requests.component';
import { ViewAllZ1RequestsComponent } from 'src/admin/view-all-z1-requests/view-all-z1-requests.component';
import { LoginComponent } from './login/login.component';
import { RegistrationComponent } from './registration/registration.component';
import { P1CreateFormComponent } from './p1/p1-create-form/p1-create-form.component';

const routes: Routes = [
  { path: 'z1', component: Z1CreateFormComponent },
  { path: 'viewA1', component: ViewAllA1RequestsComponent },
  { path: 'viewZ1', component: ViewAllZ1RequestsComponent },
  { path: 'a1', component: A1CreateFormComponent },
  { path: '', component: A1CreateFormComponent },
  { path: 'login', component: LoginComponent },
  { path: 'registration', component: RegistrationComponent },
  { path: 'p1', component: P1CreateFormComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
