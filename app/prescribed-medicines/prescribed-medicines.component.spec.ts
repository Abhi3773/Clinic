import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PrescribedMedicinesComponent } from './prescribed-medicines.component';

describe('PrescribedMedicinesComponent', () => {
  let component: PrescribedMedicinesComponent;
  let fixture: ComponentFixture<PrescribedMedicinesComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PrescribedMedicinesComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PrescribedMedicinesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
