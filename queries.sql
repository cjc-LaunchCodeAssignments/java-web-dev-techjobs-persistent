## Part 1: Test it with SQL
DESCRIBE job;
--id, employer, name, skills


## Part 2: Test it with SQL
SELECT name
FROM employer
WHERE location = "St. Louis Missouri";

## Part 3: Test it with SQL
DROP TABLE job;


## Part 4: Test it with SQL
SELECT s.name, s.description
FROM skill s
INNER JOIN job_skills js ON s.id = js.skills_id
WHERE js.jobs_id IS NOT NULL
ORDER BY s.name ASC;