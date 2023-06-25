# cs305

Briefly summarize your client, Artemis Financial, and their software requirements. Who was the client? What issue did they want you to address? 
  
  Artmeis Financial, as it's name implies, is a financial company. They wanted a modern web application that allowed secure communication to protect customer and internal data.  
    
What did you do very well when you found your client’s software security vulnerabilities? Why is it important to code securely? What value does software security add to a company’s overall wellbeing?  

  I believe I implented the encryption algorithm really well in addressing the security vulnerabilites. Secure coding is important because it addressess security concerns during the development cycle - rather than waiting for cyber security teams to review code and add security measures later. It saves time and it stresses the importance of software security throughout the development lifecycle.  
    
What part of the vulnerability assessment was challenging or helpful to you?

  I found the dependency check rather confusing. Part of it was our base code used a lot of older versions of plugins and dependencies which created a lot of perceived vulnerabilites. It was hard to tell if the vulnerability would have been addressed through updating- and I wasn't sure if I could update anything to follow along with the project accurately.  
    
How did you increase layers of security? In the future, what would you use to assess vulnerabilities and decide which mitigation techniques to use?  

  I added a self-signed certificate and encrpytion algorithm. I would continue to use the maven dependency tool to run vulnerability scans as well as perform routine code reviews. 
How did you make certain the code and software application were functional and secure? After refactoring the code, how did you check to see whether you introduced new vulnerabilities?

  I performed a vulnerability scan prior to refactoring my code, then after and compared scans to see if anything new came up. 
    
What resources, tools, or coding practices did you use that might be helpful in future assignments or tasks?

  I used Oracle's Java security standards to review cypher algorithms. I also made sure that my code was noted and easy to read and understand. 
Employers sometimes ask for examples of work that you have successfully completed to show your skills, knowledge, and experience. What might you show future employers from this assignment?

  I would show them my ability to run and read vulnerability scans as well as how I implemented the SHA-256 encryption algorithm.
