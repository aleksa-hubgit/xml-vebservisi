
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { A1CreateFormComponent } from './a1/a1-create-form/a1-create-form.component';
import { Z1CreateFormComponent } from './z1/z1-create-form/z1-create-form.component';
import { FormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { NicanskaComponent } from './nicanska/nicanska.component';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HttpClientModule } from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    A1CreateFormComponent,
    Z1CreateFormComponent,
    NicanskaComponent,

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule ,
    CommonModule,
    HttpClientModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
