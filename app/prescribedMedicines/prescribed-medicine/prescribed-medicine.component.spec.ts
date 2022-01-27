import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PrescribedMedicineComponent } from './prescribed-medicine.component';

describe('PrescribedMedicineComponent', () => {
  let component: PrescribedMedicineComponent;
  let fixture: ComponentFixture<PrescribedMedicineComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PrescribedMedicineComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PrescribedMedicineComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
