import { TestBed } from '@angular/core/testing';

import { ApiGamesService } from './api-games.service';

describe('ApiGamesService', () => {
  let service: ApiGamesService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ApiGamesService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
