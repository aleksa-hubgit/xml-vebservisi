import { ComponentFixture, TestBed } from '@angular/core/testing';

import { P1CreateFormComponent } from './p1-create-form.component';

describe('P1CreateFormComponent', () => {
  let component: P1CreateFormComponent;
  let fixture: ComponentFixture<P1CreateFormComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ P1CreateFormComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(P1CreateFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
