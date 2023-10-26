import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';

import { MultitenancyJhipsterSharedModule } from 'app/shared/shared.module';
import { ChannelComponent } from './channel.component';
import { ChannelDetailComponent } from './channel-detail.component';
import { ChannelUpdateComponent } from './channel-update.component';
import { ChannelDeleteDialogComponent } from './channel-delete-dialog.component';
import { channelRoute } from './channel.route';

@NgModule({
  imports: [MultitenancyJhipsterSharedModule, RouterModule.forChild(channelRoute)],
  declarations: [ChannelComponent, ChannelDetailComponent, ChannelUpdateComponent, ChannelDeleteDialogComponent],
  entryComponents: [ChannelDeleteDialogComponent],
})
export class MultitenancyJhipsterChannelModule {}
