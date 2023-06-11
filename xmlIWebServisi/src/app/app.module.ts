
import { AppComponent } from './app.component';
import { A1CreateFormComponent } from './a1/a1-create-form/a1-create-form.component';
import { Z1CreateFormComponent } from './z1/z1-create-form/z1-create-form.component';
import { FormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HttpClientModule } from '@angular/common/http';
import { ViewAllZ1RequestsComponent } from 'src/admin/view-all-z1-requests/view-all-z1-requests.component';

import { BrowserModule } from '@angular/platform-browser';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatTableModule } from '@angular/material/table';
import { MatButtonModule } from '@angular/material/button'
import { ViewAllA1RequestsComponent } from 'src/admin/view-all-a1-requests/view-all-a1-requests.component';
import { DetailA1Component } from 'src/admin/detail-a1/detail-a1.component';
import { DetailZ1Component } from 'src/admin/detail-z1/detail-z1.component';
import { LoginComponent } from './login/login.component';
import { RegistrationComponent } from './registration/registration.component';
import { P1CreateFormComponent } from './p1/p1-create-form/p1-create-form.component';

@NgModule({
  declarations: [
    AppComponent,
    A1CreateFormComponent,
    Z1CreateFormComponent,
    ViewAllZ1RequestsComponent,
    ViewAllA1RequestsComponent,
    DetailA1Component,
    DetailZ1Component,
    LoginComponent,
    RegistrationComponent,
    P1CreateFormComponent
  

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule ,
    CommonModule,
    HttpClientModule,
    BrowserModule,
    BrowserAnimationsModule,
    MatTableModule,
    MatButtonModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
