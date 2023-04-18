import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Z1CreateFormComponent } from './z1-create-form.component';

describe('Z1CreateFormComponent', () => {
  let component: Z1CreateFormComponent;
  let fixture: ComponentFixture<Z1CreateFormComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ Z1CreateFormComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Z1CreateFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
