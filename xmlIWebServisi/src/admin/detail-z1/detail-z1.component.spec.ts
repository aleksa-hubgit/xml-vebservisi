import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DetailZ1Component } from './detail-z1.component';

describe('DetailZ1Component', () => {
  let component: DetailZ1Component;
  let fixture: ComponentFixture<DetailZ1Component>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DetailZ1Component ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DetailZ1Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
