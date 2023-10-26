import { IUser } from 'app/core/user/user.model';

export interface IChannel {
  id?: number;
  name?: string;
  users?: IUser[];
}

export class Channel implements IChannel {
  constructor(public id?: number, public name?: string, public users?: IUser[]) {}
}
