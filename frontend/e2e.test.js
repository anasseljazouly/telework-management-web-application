
describe("App.js", () => {

  jest.setTimeout(40000);
      it("Se connecter", async () => {
  
        await page.goto('http://localhost:3000')
        await page.waitForSelector('#email');
  
      await expect(page).toFillForm('.Auth', {
        email: 'anass.eljazouly@gmail.com',
        password: '1234',
      })
      await expect(page).toClick('button', { text: 'Connecter' })
    })
  
    it("Echec de connexion", async () => {
     
      await page.goto('http://localhost:3000')
        await page.waitForSelector("#email");
  
      await expect(page).toFillForm('.Auth', {
        email: 'anass.eljazouly@gmail.com',
        password: 'password123',
      })
  
      await expect(page).toClick('button', { text: 'Connecter' })
      await expect(page).toMatchElement('div','.alert')
    })
    it("Acceder au plannings et aux notifications puis se déconnecter", async () => {
     
      await page.goto('http://localhost:3000/')
      await page.waitForSelector('#email');

    await expect(page).toFillForm('.Auth', {
      email: 'anass.eljazouly@gmail.com',
      password: '1234',
    })
    await expect(page).toClick('button', { text: 'Connecter' });
    await page.goto('http://localhost:3000/monPlanning');
    await page.goto('http://localhost:3000/notifications');
   
    await expect(page).toMatchElement('button','#deconnect-btn');
   
  })


  


    


    
  });