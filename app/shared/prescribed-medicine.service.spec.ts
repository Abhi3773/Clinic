import { TestBed } from '@angular/core/testing';

import { PrescribedMedicineService } from './prescribed-medicine.service';

describe('PrescribedMedicineService', () => {
  let service: PrescribedMedicineService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(PrescribedMedicineService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
