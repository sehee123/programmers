-- 코드를 입력하세요
select count(*) from(
SELECT name, count(*) from animal_ins 
where name is not null
group by name 
    )a
;