# Write your MySQL query statement below
select p.product_id, coalesce(round(sum(p.price*u.units)/sum(units),2),0) as average_price
from prices p left join unitssold u
on p.product_id= u.product_id && u.purchase_date>= p.start_date && u.purchase_date<=p.end_date
group by p.product_id;