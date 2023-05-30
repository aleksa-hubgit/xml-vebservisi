import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewAllZ1RequestsComponent } from './view-all-z1-requests.component';

describe('ViewAllZ1RequestsComponent', () => {
  let component: ViewAllZ1RequestsComponent;
  let fixture: ComponentFixture<ViewAllZ1RequestsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ViewAllZ1RequestsComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ViewAllZ1RequestsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
