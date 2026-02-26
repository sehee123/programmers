-- 코드를 입력하세요
SELECT book_id, to_char(published_date,'yyyy-mm-dd') as publised_date
from book
where 1=1
and category = '인문'
and published_date >= to_date('2021-01-01','yyyy-mm-dd')
and published_date < to_date('2022-01-01','yyyy-mm-dd')
order by published_date 