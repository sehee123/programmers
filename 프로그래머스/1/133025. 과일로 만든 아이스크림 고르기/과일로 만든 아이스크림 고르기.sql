-- 코드를 입력하세요
SELECT a.flavor 
from icecream_info a, first_half b
where a.flavor = b.flavor
and b.total_order > 3000
and a.ingredient_type = 'fruit_based'
order by b.total_order desc