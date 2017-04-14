----------------------------------------------
-- AUTHOR: Dani Marcoullier (reprise), 2017.--
----------------------------------------------

-- Make a new user if they don't exist (username is primary key)
-- 'ON DUPLICATE KEY' clause not valid on ANSI SQL.
INSERT INTO PLAYER (USERNAME, HANGMAN, TIKTAK, MT4x4, MT6x6) 
VALUES ('testuser123', 0.0 ,0.0 ,0.0 ,0.0 ) --ON DUPLICATE KEY INSERT IGNORE

--Show whole player table.
SELECT * FROM OPERATOR.PLAYER

-- The top 10 Tables query for Hangman. Top 10 from HangmanAllTime
-- For ANSI SQL. other types of SQL use 'LIMIT' clause.
SELECT * FROM HANGMANALLTIME
FETCH FIRST 1 ROWS ONLY --ANSI SQL uses this line.

--Query for HangmanAlltime in the leaderboards.
SELECT * FROM HANGMANALLTIME ORDER BY SCORE DESC, DATE

-- update a player's account if their score is higher than their previous.
UPDATE PLAYER
SET HANGMAN = 100
WHERE HANGMAN IN (
    SELECT HANGMAN
    FROM PLAYER
    WHERE USERNAME = 'testuser123' AND HANGMAN < 25
)
AND USERNAME = 'testuser123'

-- update a player's post in HangmanAlltime to the new score with new date if
-- It's higher than their previous score.
UPDATE HANGMANALLTIME
SET SCORE = 80, DATE = '2017-01-01'
    WHERE SCORE IN (
    SELECT SCORE
    FROM HANGMANALLTIME
    WHERE USERNAME = 'testuser123' AND SCORE < 80
)
AND USERNAME = 'testuser123'
