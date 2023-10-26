import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';

@NgModule({
  imports: [
    RouterModule.forChild([
      {
        path: 'channel',
        loadChildren: () => import('./channel/channel.module').then(m => m.MultitenancyJhipsterChannelModule),
      },
      {
        path: 'tenant',
        loadChildren: () => import('./tenant/tenant.module').then(m => m.MultitenancyJhipsterTenantModule),
      },
      /* jhipster-needle-add-entity-route - JHipster will add entity modules routes here */
    ]),
  ],
})
export class MultitenancyJhipsterEntityModule {}
