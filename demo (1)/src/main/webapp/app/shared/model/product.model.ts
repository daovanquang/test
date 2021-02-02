import { ICategory } from 'app/shared/model/category.model';

export interface IProduct {
  id?: number;
  name?: string;
  categoryTag?: string;
  price?: number;
  category?: ICategory;
}

export class Product implements IProduct {
  constructor(public id?: number, public name?: string, public categoryTag?: string, public price?: number, public category?: ICategory) {}
}
