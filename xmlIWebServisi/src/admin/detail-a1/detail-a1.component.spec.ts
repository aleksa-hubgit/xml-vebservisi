import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DetailA1Component } from './detail-a1.component';

describe('DetailA1Component', () => {
  let component: DetailA1Component;
  let fixture: ComponentFixture<DetailA1Component>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DetailA1Component ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DetailA1Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
