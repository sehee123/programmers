-- 코드를 입력하세요
select name from (
SELECT name ,rank () over (order by datetime) as rank from animal_ins
where 1=1
order by datetime
)
where rank = 1