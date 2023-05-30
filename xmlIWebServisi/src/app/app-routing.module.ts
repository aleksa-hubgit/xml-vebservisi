import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { Z1CreateFormComponent } from './z1/z1-create-form/z1-create-form.component';
import { A1CreateFormComponent } from './a1/a1-create-form/a1-create-form.component';
import { ViewAllA1RequestsComponent } from 'src/admin/view-all-a1-requests/view-all-a1-requests.component';
import { ViewAllZ1RequestsComponent } from 'src/admin/view-all-z1-requests/view-all-z1-requests.component';


const routes: Routes = [
  { path: 'z1', component: Z1CreateFormComponent },
  { path: 'viewA1', component: ViewAllA1RequestsComponent },
  { path: 'viewZ1', component: ViewAllZ1RequestsComponent },
  { path: 'a1', component: A1CreateFormComponent },
  { path: '', component : A1CreateFormComponent },


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
