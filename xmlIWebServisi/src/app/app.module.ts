import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { A1CreateFormComponent } from './a1/a1-create-form/a1-create-form.component';

@NgModule({
  declarations: [
    AppComponent,
    A1CreateFormComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
