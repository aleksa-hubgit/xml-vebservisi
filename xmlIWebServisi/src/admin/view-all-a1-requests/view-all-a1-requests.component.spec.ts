import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewAllA1RequestsComponent } from './view-all-a1-requests.component';

describe('ViewAllA1RequestsComponent', () => {
  let component: ViewAllA1RequestsComponent;
  let fixture: ComponentFixture<ViewAllA1RequestsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ViewAllA1RequestsComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ViewAllA1RequestsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
