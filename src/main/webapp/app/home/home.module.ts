import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';

import { MultitenancyJhipsterSharedModule } from 'app/shared/shared.module';
import { HOME_ROUTE } from './home.route';
import { HomeComponent } from './home.component';

@NgModule({
  imports: [MultitenancyJhipsterSharedModule, RouterModule.forChild([HOME_ROUTE])],
  declarations: [HomeComponent],
})
export class MultitenancyJhipsterHomeModule {}
