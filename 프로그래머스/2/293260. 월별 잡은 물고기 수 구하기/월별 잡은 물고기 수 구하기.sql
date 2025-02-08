-- 코드를 작성해주세요
select fish_count ,cast(month as unsigned) as month from (
select count(date_format(time,'%m')) fish_count 
,date_format(time,'%m')  month
from fish_info
group by date_format(time,'%m')
) a
order by 2