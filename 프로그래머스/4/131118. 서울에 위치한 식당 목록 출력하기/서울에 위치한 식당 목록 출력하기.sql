select a.rest_id , rest_name , food_type , favorites,address 
,round(avg(b.review_score),2) as score
from rest_info a , rest_review b 
where address like '서울%'
and a.rest_id = b.rest_id
group by a.rest_id , rest_name ,food_type , favorites,address
order by score desc , favorites desc
;