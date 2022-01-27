import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PrescribedMedicineListComponent } from './prescribed-medicine-list.component';

describe('PrescribedMedicineListComponent', () => {
  let component: PrescribedMedicineListComponent;
  let fixture: ComponentFixture<PrescribedMedicineListComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PrescribedMedicineListComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PrescribedMedicineListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
