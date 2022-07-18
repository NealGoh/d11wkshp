# Workshop 11 Intstruction

### Maven commands
1. ./mvnw
2. ./mvnw compile
3. ./mvnw package
4. ./mvnw clean package
5. ./mvnw clean
6. ./mvnw clean package spring-boot:run
7. ./mvnw spring-boot:run

### Git commands
1. git init
2. git remote add origin https://github.com/<username>/<projectname>.git
3. git add .
4. git status
5. git commit -m "<message>"
6. git push -u origin master
7. git pull 
8. git branch -a
9. git branch -delete <branch name>
10. git add . (add to develop branch)
11. git commit -m "add readme file" (add to develop branch)
12. git push -u origin develop (push to remote git develop branch)
13. git checkout master
14. git merge develop (merge changes done in develop branch into master branch)
15. git push -u origin master

// make changes in master, and need to synchronise this change to develop branch
// assume changes has already been checked into master branch
16. git checkout develop
17. git merge master (merge changes done in master branch into develop branch)
18. git push -u origin develop