import { ComponentFixture, TestBed } from '@angular/core/testing';

import { A1CreateFormComponent } from './a1-create-form.component';

describe('A1CreateFormComponent', () => {
  let component: A1CreateFormComponent;
  let fixture: ComponentFixture<A1CreateFormComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ A1CreateFormComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(A1CreateFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
