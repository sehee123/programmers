-- 코드를 작성해주세요
select count(a.fish_type) fish_count , b.fish_name 
from fish_info a , fish_name_info b
where 1=1
and a.fish_type = b.fish_type 
group by a.fish_type  , b.fish_name
order by 1 desc
