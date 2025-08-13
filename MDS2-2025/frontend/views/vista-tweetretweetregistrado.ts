import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/horizontal-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vertical-layout/src/vaadin-vertical-layout.js';
import '@vaadin/button/src/vaadin-button.js';
import '@vaadin/text-area/src/vaadin-text-area.js';

@customElement('vista-tweetretweetregistrado')
export class VistaTweetretweetregistrado extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="width: 100%; height: 30%; padding: var(--lumo-space-xl);"></vaadin-horizontal-layout>
 <vaadin-horizontal-layout id="vaadinHorizontalLayout1" style="width: 100%;">
  <vaadin-vertical-layout id="vaadinVerticalLayout1" style="width: 30%;"></vaadin-vertical-layout>
  <vaadin-button id="meGusta" style="align-self: center; width: 15%;" tabindex="0">
   Me Gusta
  </vaadin-button>
  <vaadin-vertical-layout id="vaadinVerticalLayout5" style="width: 30%;"></vaadin-vertical-layout>
  <vaadin-button id="reTweet" style="align-self: center; width: 15%;" tabindex="0">
   ReTweet
  </vaadin-button>
  <vaadin-vertical-layout id="vaadinVerticalLayout4" style="width: 30%;"></vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout3" style="width: 100%; padding-right: var(--lumo-space-xl); padding-left: var(--lumo-space-xl); height: 20%; align-self: center;">
  <vaadin-text-area label="" placeholder="Comentario" id="comentario" style="width: 85%;"></vaadin-text-area>
  <vaadin-button id="comentar" style="align-self: center; height: 40%;" tabindex="0">
   Comentar
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout id="comentarios" style="width: 100%; height: 50%; padding-top: var(--lumo-space-m); padding-right: var(--lumo-space-m); padding-left: var(--lumo-space-m); padding-bottom: var(--lumo-space-m);"></vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout2" style="width: 100%;">
  <vaadin-vertical-layout id="vaadinVerticalLayout3" style="width: 45%;"></vaadin-vertical-layout>
  <vaadin-button id="volver" style="align-self: center; width: 10%;" tabindex="0">
   Volver
  </vaadin-button>
  <vaadin-vertical-layout id="vaadinVerticalLayout2" style="width: 45%;"></vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
