import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TestResultListComponent } from './test-result-list.component';

describe('TestResultListComponent', () => {
  let component: TestResultListComponent;
  let fixture: ComponentFixture<TestResultListComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TestResultListComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TestResultListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});