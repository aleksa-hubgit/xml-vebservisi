import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NicanskaComponent } from './nicanska.component';

describe('NicanskaComponent', () => {
  let component: NicanskaComponent;
  let fixture: ComponentFixture<NicanskaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ NicanskaComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(NicanskaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
