WITH A AS (SELECT COUNT(DISTINCT USER_ID) AS TOTALUSERS
          FROM USER_INFO
          WHERE YEAR(JOINED)='2021'
)

SELECT YEAR(O.SALES_DATE) AS YEAR,
        MONTH(O.SALES_DATE) AS MONTH,
        COUNT(DISTINCT O.USER_ID) AS PURCHASED_USERS,
        ROUND(COUNT(DISTINCT O.USER_ID)/A.TOTALUSERS,1) AS PURCHASED_RATIO
FROM ONLINE_SALE O, A A, USER_INFO U
WHERE U.USER_ID=O.USER_ID AND YEAR(U.JOINED)='2021'
GROUP BY YEAR, MONTH
ORDER BY YEAR, MONTH;

# 다른풀이(JOIN 두 개 사용)
# WITH A AS (
#     SELECT COUNT(DISTINCT USER_ID) AS TOTALUSERS
#     FROM USER_INFO
#     WHERE YEAR(JOINED) = '2021'
# )
# SELECT 
#     YEAR(O.SALES_DATE) AS YEAR,
#     MONTH(O.SALES_DATE) AS MONTH,
#     COUNT(DISTINCT O.USER_ID) AS PURCHASED_USERS,
#     ROUND(COUNT(DISTINCT O.USER_ID) / A.TOTALUSERS, 1) AS PURCHASED_RATIO
# FROM ONLINE_SALE O
# -- JOIN 여러개 쓸 때 먼저 적은 것부터 차례대로 JOIN이 적용된다
# JOIN USER_INFO U ON U.USER_ID = O.USER_ID
# JOIN A ON 1 = 1  -- 모든 결과에 A를 적용
# WHERE YEAR(U.JOINED) = '2021'
# GROUP BY YEAR(O.SALES_DATE), MONTH(O.SALES_DATE)
# ORDER BY YEAR(O.SALES_DATE), MONTH(O.SALES_DATE);
